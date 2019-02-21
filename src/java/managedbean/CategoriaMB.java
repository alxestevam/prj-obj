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
import model.Categoria;
import org.primefaces.event.RowEditEvent;
import service.CategoriaService;

/**
 *
 * @author 141812
 */
@ManagedBean
@SessionScoped
public class CategoriaMB {
    private Categoria categoria = new Categoria();
    private CategoriaService service = new CategoriaService();
    private Categoria selectedCategoria;

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    public void addCategoria() {
        service.addCategoria(categoria);
        categoria = new Categoria();
    }
    
    public void removeCategoria() {
        service.removeCategoria(selectedCategoria);
    }
    
    public void removeCategoria(Categoria c) {
        service.removeCategoria(c);
    }
    
    public List<Categoria> getCategorias(){
        return service.getCategorias();
    }

    public Categoria getSelectedCategoria() {
        return selectedCategoria;
    }

    public void setSelectedCategoria(Categoria selectedCategoria) {
        this.selectedCategoria = selectedCategoria;
    }
    
    public void onRowEdit(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Categoria Editada",
                ((Categoria) event.getObject()).getDescricao());
        FacesContext.getCurrentInstance().
                addMessage(null, msg);
    }
}