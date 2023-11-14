package com.biblioteca.biblioteca.servicios;

import com.biblioteca.biblioteca.entidades.Autor;
import com.biblioteca.biblioteca.entidades.Editorial;
import com.biblioteca.biblioteca.entidades.Libro;
import com.biblioteca.biblioteca.excepciones.MiException;
import com.biblioteca.biblioteca.repositorios.AutorRepositorio;
import com.biblioteca.biblioteca.repositorios.EditorialRepositorio;
import com.biblioteca.biblioteca.repositorios.LibroRepositorio;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroServicio {

    @Autowired
    private LibroRepositorio libroRepositorio;

    @Autowired
    private AutorRepositorio autorRepositorio;

    @Autowired
    private EditorialRepositorio editorialRepositorio;

    @Transactional
    public void crearLibro(Long isbn, String titulo, Integer ejemplares, String idAutor, String idEditorial) throws MiException {
        
        validar(isbn, titulo, ejemplares, idAutor, idEditorial);

        Autor autor = autorRepositorio.findById(idAutor).get();
        Libro libro = new Libro();

        Editorial editorial = editorialRepositorio.findById(idEditorial).get();

        libro.setISBN(isbn);
        libro.setTitulo(titulo);
        libro.setEjemplares(ejemplares);
        libro.setAlta(new Date());

        libro.setAutor(autor);
        libro.setEditorial(editorial);

        libroRepositorio.save(libro);

    }

    public List<Libro> ListarLibros() {

        List<Libro> libros = new ArrayList();

        libros = libroRepositorio.findAll();

        return libros;
    }

    public void modificarLibro(Long isbn, String titulo, String idAutor, String idEditorial, Integer ejemplares) throws MiException {
        
        validar(isbn, titulo, ejemplares, idAutor, idEditorial);
        //        Libro libro = libroRepositorio.findById(isbn).get(); si usamos este método y el isbn tiene algún error, estamos al horno. Entonces vamos con Optional

        Optional<Libro> respuesta = libroRepositorio.findById(isbn);
        Optional<Autor> respuestaAutor = autorRepositorio.findById(idAutor);
        Optional<Editorial> respuestaEditorial = editorialRepositorio.findById(idEditorial);

        Autor autor = new Autor();
        Editorial editorial = new Editorial();

        if (respuestaAutor.isPresent()) {
            autor = respuestaAutor.get();
        }

        if (respuestaEditorial.isPresent()) {
            editorial = respuestaEditorial.get();
        }

        if (respuesta.isPresent()) {

            Libro libro = respuesta.get();

            libro.setTitulo(titulo);

            libro.setAutor(autor);

            libro.setEditorial(editorial);

            libro.setEjemplares(ejemplares);

            libroRepositorio.save(libro);

        }

    }
    
    private void validar(Long isbn, String titulo, Integer ejemplares, String idAutor, String idEditorial) throws MiException{
         if (isbn == null) {
            throw new MiException("El ISBN no puede ser nulo");
        }
        if (titulo == null || titulo.isEmpty()) {
            throw new MiException("El título no puede ser nulo o estar vacío");            
        }
        
        if (ejemplares == null) {
            throw new MiException("Ejemplares no puede ser nulo");
        }
        
        if (idAutor.isEmpty() || idAutor == null) {
            throw new MiException("Indicar un autor");
        }
        
        if (idEditorial.isEmpty() || idEditorial == null) {
            throw new MiException("Indicar una editorial");
        }
    }

}
