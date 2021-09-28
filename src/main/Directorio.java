/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;


/**
 *
 * @author daniel
 */
public class Directorio {
    
    HashMap<Integer, Cliente> directorio = new HashMap<>();
    
    public boolean agregarCliente(int tel, Cliente agregar) {
        if(directorio.containsKey(tel))
            return false;
        else{
            directorio.put(tel, agregar);
            return true;
        }
        
    }
    
    public Cliente buscarCliente(int telefono){
        
        return directorio.get(telefono);
    }
    
    public List buscarTelefonos(String apellido){
        
        List<Integer> telFiltrados = new ArrayList();
        int auxiliar;
        
        Iterator it = directorio.keySet().iterator();
        
        while(it.hasNext()){
            auxiliar = (int)it.next();
            if(directorio.get(auxiliar).getApellido().equalsIgnoreCase(apellido));
                telFiltrados.add(auxiliar);
        }
        
        return telFiltrados;
    }
    
    public List buscarClientes(String ciudad){
        List<Cliente> clientesEnCiudad = new ArrayList<>();
        return clientesEnCiudad;
    }
    
    public void borrarCliente(int dni){
        
    }
}

