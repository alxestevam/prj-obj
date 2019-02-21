/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedbean;

import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import model.Cliente;
import org.primefaces.event.RowEditEvent;
import service.ClienteService;

/**
 *
 * @author 141812
 */
@ManagedBean
@SessionScoped
public class ClienteMB {
    private Cliente cliente = new Cliente();
    private final ClienteService service = new ClienteService();
    private Cliente selectedCliente;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public void addCliente() {
        service.addCliente(cliente);
        cliente = new Cliente();
    }
    
    public void removeCliente() {
        service.removeCliente(selectedCliente);
    }
    
    public void removeCliente(Cliente c) {
        service.removeCliente(c);
    }
    
    public List<Cliente> getClientes(){
        return service.getClientes();
    }

    public Cliente getSelectedCliente() {
        return selectedCliente;
    }

    public void setSelectedCliente(Cliente selectedCliente) {
        this.selectedCliente = selectedCliente;
    }
    
    public void onRowEdit(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Cliente Editado " + 
                ((Cliente) event.getObject()).getCodigo());
        FacesContext.getCurrentInstance().
                addMessage(null, msg);
    }
}