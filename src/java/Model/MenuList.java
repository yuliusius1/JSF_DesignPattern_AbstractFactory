/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Windows10
 */
public class MenuList {
    private Long id;
    private String name;
    private Long idMenu;
    
    public MenuList(){
        
    }

    public MenuList(Long id, String name, Long idMenu) {
        this.id = id;
        this.name = name;
        this.idMenu = idMenu;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(Long idMenu) {
        this.idMenu = idMenu;
    }
    
}
