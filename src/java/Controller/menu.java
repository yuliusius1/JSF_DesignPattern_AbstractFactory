
package Controller;


import Model.MenuList;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import Model.MenuModel;
import Model.ResultList;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;


@ManagedBean
@SessionScoped
public class menu implements Serializable{
    private Long idMenu;
    private Long idMenuList;
    private List<MenuModel> menumodel_list;
    private List<MenuList> menulist;
    private List<MenuList> menutmplist;
    private String productName;
    private Long productID;
    private int jumlah;
    private String result;
    private List<ResultList> resultlist;
    private int totalPrice;
    private String resetSession;

    public menu(){
        this.menumodel_list = new ArrayList<>(3);
        this.menumodel_list.add(new MenuModel(1L,"Makanan"));
        this.menumodel_list.add(new MenuModel(2L,"Minuman"));
        this.menumodel_list.add(new MenuModel(3L,"Sambal"));
        
        this.menulist = new ArrayList<>(12);
        this.menulist.add(new MenuList(1L,"NasiLanggi",1L));
        this.menulist.add(new MenuList(2L,"NasiOpor",1L));
        this.menulist.add(new MenuList(3L,"LontongOpor",1L));
        this.menulist.add(new MenuList(1L,"Teh",2L));
        this.menulist.add(new MenuList(2L,"Jeruk",2L));
        this.menulist.add(new MenuList(3L,"Sirup",2L));
        this.menulist.add(new MenuList(1L,"Terasi",3L));
        this.menulist.add(new MenuList(2L,"Bawang",3L));
        this.menulist.add(new MenuList(3L,"Matah",3L));
        
        this.resultlist = new ArrayList<>();
        
    }

    public List<ResultList> getResultlist() {
        return resultlist;
    }

    public void setResultlist(List<ResultList> resultlist) {
        this.resultlist = resultlist;
    }
    
    public List<MenuModel> getMenumodel_list() {
        return menumodel_list;
    }

    public void setMenumodel_list(List<MenuModel> menumodel_list) {
        this.menumodel_list = menumodel_list;
    }
    
    public List<MenuList> getMenulist() {
        return menulist;
    }

    public void setMenulist(List<MenuList> menulist) {
        this.menulist = menulist;
    }

    public List<MenuList> getMenutmplist() {
        return menutmplist;
    }

    public void setMenutmplist(List<MenuList> menutmplist) {
        this.menutmplist = menutmplist;
    }
    
    public void ControlMenuChange(){
        if(this.idMenu!=null && !this.idMenu.equals(0L)){
            this.menutmplist = new ArrayList<>();
            for (MenuList c: this.menulist){
                if(c.getIdMenu().equals(this.idMenu)){
                    this.menutmplist.add(c);
                }
            }
        }
    }
    
    public Long getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(Long idMenu) {
        this.idMenu = idMenu;
    }

    public Long getIdMenuList() {
        return idMenuList;
    }

    public void setIdMenuList(Long idMenuList) {
        this.idMenuList = idMenuList;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Long getProductID() {
        return productID;
    }

    public void setProductID(Long productID) {
        this.productID = productID;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
    
    
    
    public String Outputk(){
        
        this.totalPrice = 0;
        for (ResultList c: this.resultlist){
            this.totalPrice += c.getItemPrice();
        }
        return "result";
    }
    
    public String getResetSession(){
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "index.xhtml";
    }
    
    public void Outputku(){
        this.menulist.stream().filter((c) -> (c.getId().equals(this.idMenuList) && c.getIdMenu().equals(this.idMenu))).map((c) -> {
            productName = c.getName();
            return c;
        }).forEachOrdered((c) -> {
            productID = c.getId();
        });
        
        if(this.idMenu!=null && !this.idMenu.equals(0L) && this.jumlah != 0 ){
            if(this.idMenu.equals(1L)){
                AbstractFactory makanan = FactoryProducer.getFactory("Makanan");
                Makanan makanan1 = makanan.getMakanan(this.productName,this.jumlah);
                this.resultlist.add(new ResultList(makanan1.getJumlahMakanan(),makanan1.getNamaMakanan(),makanan1.getHargaMakanan()));

            } else if(this.idMenu.equals(2L)){
                AbstractFactory minuman = FactoryProducer.getFactory("Minuman");
                Minuman minuman1 = minuman.getMinuman(this.productName,this.jumlah);
                this.resultlist.add(new ResultList(minuman1.getJumlahMinuman(),minuman1.getNamaMinuman(),minuman1.getHargaMinuman()));

            } else if(this.idMenu.equals(3L)){
                AbstractFactory sambal = FactoryProducer.getFactory("Sambal");
                Sambal sambal1 = sambal.getSambal(this.productName,this.jumlah);
                this.resultlist.add(new ResultList(sambal1.getJumlahSambal(),sambal1.getNamaSambal(),sambal1.getHargaSambal()));
            } 
            
        }
    }
    

    

    
    
    
    
   
    
    
    
}
