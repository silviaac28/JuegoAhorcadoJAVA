package com.primerprograma;

public class array {
    
}


package com.arreglos;


import java.util.ArrayList;


public class Main {
   public static void main(String[] args) {


       ArrayList<String> list = new ArrayList<>();//crear un arraylist
       ArrayList<Estudiante> lstStudents = new ArrayList<>();
       list.add("Backend java"); //agregar valor a la lista en la ultima psocion
       list.add(0,"Fundamentos");// agregar valor en la posicion 0
       @SuppressWarnings("unused")
       String elemento= list.get(0); // obtener valor en la posicion 0
       list.set(0,"programacion web"); // cambiar valor posicion 0
       String eliminado  =list.remove(1); // eliminar calor den posicion 1




       System.out.println(eliminado);    //imprimir valor eliminado
  
       System.out.println(list);    //imprimir lista
    
       //list.clear();   //vaciar lsita
       System.out.println(list);






       for(String item : list){
           System.out.println(item);
       }
   }
}
