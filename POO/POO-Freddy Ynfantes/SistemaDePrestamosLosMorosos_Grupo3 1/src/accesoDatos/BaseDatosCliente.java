
package accesoDatos;

import entidades.*;
import java.util.*;

public class BaseDatosCliente {
    private ArrayList<ClienteNatural> clientesN;
    private ArrayList<ClienteJuridico> clientesJ;
    private ArrayList<Cliente> clientes;

    public BaseDatosCliente() {
        clientesN = new ArrayList();
        clientesJ = new ArrayList();
        clientes = new ArrayList();
    }
    
    public void agregarClientes(Cliente obj){
        clientes.add(obj);
    }
    
    public void agregarClienteN(ClienteNatural obj){
        clientesN.add(obj);
        agregarClientes(obj);
    }
    
    public void agregarClienteJ(ClienteJuridico obj){
        clientesJ.add(obj);
        agregarClientes(obj);
    }
    
    public void eliminarClienteN(String dni){
        for(int i=0;i<clientesN.size();i++){
            if(clientesN.get(i).getCodigo().equals(dni)){
                clientesN.remove(i);
            }
        }
        eliminarCliente(dni);
    }
    
    public void eliminarClienteJ(String ruc){
        for(int i=0;i<clientesJ.size();i++){
            if(clientesJ.get(i).getCodigo().equals(ruc)){
                clientesJ.remove(i);
            }
        }
        eliminarCliente(ruc);
    }
    
    public void eliminarCliente(String codigo){
        for(int i=0;i<clientes.size();i++){
            if(clientes.get(i).getCodigo().equals(codigo)){
                clientes.remove(i);
            }
        }
    }
    
    public void modificarClienteN(ClienteNatural cn, String dni){
        for(int i=0;i<clientesN.size();i++){
            if(clientesN.get(i).getCodigo().equals(dni)){
                clientesN.set(i, cn);
            }
        }
    }
    
    public void modificarClienteJ(ClienteJuridico cj, String ruc){
        for(int i=0;i<clientesJ.size();i++){
            if(clientesJ.get(i).getCodigo().equals(ruc)){
                clientesJ.set(i, cj);
            }
        }
    }
    
    public void mostrarListaClienteGeneral(){
        System.out.println("***Clientes Naturales***");
        for(int i=0;i<clientesN.size();i++){
            System.out.println(clientesN.get(i));
        }
        System.out.println("***Clientes Juridicos***");
        for(int i=0;i<clientesJ.size();i++){
            System.out.println(clientesJ.get(i));
        }
    }
    
    public void mostrarListaClientesNaturales(){
        for(int i=0;i<clientesN.size();i++){
            System.out.println(clientesN.get(i));
        }
    }
    
    public void mostrarListaClientesJuridicos(){
        for(int i=0;i<clientesJ.size();i++){
            System.out.println(clientesJ.get(i));
        }
    }
    
    public ClienteNatural buscarClienteDNI(String obj){
        for(int i=0;i<clientesN.size();i++){
            if(clientesN.get(i).getCodigo().equals(obj)){
                return clientesN.get(i);
            }
        }
        return null;
    }
    
    public ArrayList<ClienteNatural> getCNaturales(){
        return clientesN;
    }
    
    public ArrayList<ClienteJuridico> getCJuridicos(){
        return clientesJ;
    }
    
    public ArrayList<Cliente> getClientes(){
        return clientes;
    }
}
