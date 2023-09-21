package Services;

import Entities.*;

public class ArmorService {
    public Armor createArmor(){
        Armor a1 = new Armor();
        a1.setHealth(100);
        a1.setResistence(250);
        a1.setUse(15);
        a1.setBoots(new Boots());
        a1.setGloves(new Gloves());
        a1.setHelmet(new Helmet());
        return a1;
    }

    public float batteryStatus(Armor a1){
        float value = (a1.getEnergy() * 100)/ 100000;
        System.out.println("El porcentaje de energía de la armadura es de " + value + "%.");
        return value;
    }

    public void energyConversor(Armor a1){
        double gigajulios = a1.getEnergy();
        double petrolBarrels = gigajulios*40*60;
        double megavats = (gigajulios+(gigajulios*0.1))*1200;
        System.out.println("El reactor de energía está en " + gigajulios + "gigajulios, lo que es equivalente a "
        + petrolBarrels + " barriles de petróleo, o "+ megavats + " megavats.");}

    private void damaged(Object armorPart){

        double random = Math.random()*100;
        if (random < 30) { armorPart.setDamaged(true);}
    }

    /*Sufriendo Daños
Para esto, cada dispositivo contiene un
atributo público que dice si el dispositivo se encuentra dañado o no. Al utilizar un dispositivo
existe un 30% de posibilidades de que se dañe.*/

    public int walk(Armor a1, int time){
       int value = useValues("normal") * (a1.getBoots().energyConsumption()) * time;
        a1.setEnergy(a1.getEnergy()-value);
       return value;
    }

    public int run(Armor a1, int time){
        int value = (useValues("normal") * (a1.getBoots().energyConsumption() * 2) * time);
        a1.setEnergy(a1.getEnergy()-value);
        return value;
    }

    public int propulse(Armor a1, int time){
        int value = (useValues("intensivo") * (a1.getBoots().energyConsumption() * 3) * time);
        a1.setEnergy(a1.getEnergy()-value);
        return value;
    }

    public int fly(Armor a1, int time){
        int value =  (useValues("intensivo") * (a1.getBoots().energyConsumption() * 3) * time) +
                (useValues("normal") * (a1.getGloves().energyConsumption() * 2) * time);
        a1.setEnergy(a1.getEnergy()-value);
        return value;
    }

    public int shoot(Armor a1, int time){
        int value = (useValues("normal") * (a1.getGloves().energyConsumption() * 3) * time);
        a1.setEnergy(a1.getEnergy()-value);
        return value;
    }

    public int write(Armor a1, int time){
        int value = (useValues("normal") * a1.getHelmet().getConsole().energyConsumption() * time);
        a1.setEnergy(a1.getEnergy()-value);
        return value;
    }

    public int read(Armor a1, int time){
        int value = (useValues("normal") * a1.getHelmet().getConsole().energyConsumption() * time);
        a1.setEnergy(a1.getEnergy()-value);
        return value;
    }

    private int useValues(String use){
        int value = 0;
        if (use.equalsIgnoreCase("normal")) value = 2;
        if (use.equalsIgnoreCase("intensivo")) value = 5;
        return value;
    }


}




/*
Mostrando Estado: Hacer un método que JARVIS muestre el estado de todos los dispositivos y
toda la información de la Armadura.



La armadura solo podrá utilizar dispositivos que no se encuentren dañados.
Modifique las clases que sean necesarias para llevar adelante este comportamiento.
Reparando Daños
Hay veces que se puede reparar los daños de un dispositivo, en general es el 40% de las veces
que se puede hacer. Utilizar la clase Random para modelar este comportamiento. En caso de estar
dentro de la probabilidad (es decir probabilidad menor o igual al 40%) marcar el dispositivo como
sano. Si no dejarlo dañado.
Revisando Dispositivos
Los dispositivos son revisados por JARVIS para ver si se encuentran dañados. En caso de
encontrar un dispositivo dañado se debe intentar arreglarlo de manera insistente. Para esos
intentos hay un 30% de posibilidades de que el dispositivo quede destruido, pero se deberá
intentar arreglarlo hasta que lo repare, o bien hasta que quede destruido.
Hacer un método llamado revisar dispositivos que efectúe lo anteriormente descrito, el
mecanismo insistente debe efectuarlo con un bucle do while.
Radar Versión 1.0
JARVIS posee también incorporado un sistema que usa ondas electromagnéticas para medir
distancias, altitudes, ubicaciones de objetos estáticos o móviles como aeronaves barcos,
vehículos motorizados, formaciones meteorológicas y por su puesto enemigos de otro planeta.
Su funcionamiento se basa en emitir un impulso de radio, que se refleja en el objetivo y se recibe
típicamente en la misma posición del emisor.
Las ubicaciones de los objetos están dadas por las coordenadas X, Y y Z. Los objetos pueden ser
marcados o no como hostiles. JARVIS también puede detectar la resistencia del objeto, y puede
detectar hasta 10 objetos de manera simultánea.
JARVIS puede calcular la distancia a la que se encuentra cada uno de los objetos, para esto
siempre considera que la armadura se encuentra situada en la coordenada (0,0,0).
Hacer un método que informen a qué distancia se encuentra cada uno de los enemigos. Usar la
clase Math de Java.
Simulador
Hacer un método en JARVIS que agregue en radar objetos, hacer que la resistencia, las
coordenadas y la hostilidad sean aleatorios utilizando la clase random. Utilizar la clase Random.
¿Qué ocurre si quiero añadir más de 10 objetos?
¿Qué ocurre si cuando llevo 8 enemigos aumento la capacidad del vector?
Destruyendo Enemigos
Desarrollar un método para que JARVIS que analice todos los objetos del radar y si son hostiles
que les dispare. El alcance de los guantes es de 5000 metros, si el objeto se encuentra fuera de
ese rango no dispara.
JARVIS al detectar un enemigo lo atacará hasta destruirlo, la potencia del disparo es inversamente
proporcional a la distancia al a que se encuentra el enemigo y se descontará de la resistencia del
enemigo. El enemigo se considera destruido si su resistencia es menor o igual a cero.
JARVIS solo podrá disparar si el dispositivo está sano y si su nivel de batería lo permite. Si tiene
los dos guantes sanos podrá disparar con ambos guantes haciendo más daño. Resolver utilizando
un for each para recorrer el arreglo y un while para destruir al enemigo.
Acciones Evasivas
Desarrollamos un método para que JARVIS que analice todos los objetos del radar y si son
hostiles que les dispare. Modificar ese método para que si el nivel de batería es menor al 10% se
corten los ataques y se vuelve lo suficientemente lejos para que el enemigo no nos ataque.
Deberíamos alejarnos por lo menos 10 km enemigo. Tener en cuenta que la velocidad de vuelo
promedio es de 300 km / hora.
 */