package cabiso.daphny.com.gcompanion.Model;

/**
 * Created by Lenovo on 7/29/2017.
 */

public class DIYitem {

    private String Image_URL, diyName, diyPrice, diyCategory;

    public DIYitem(String image_URL, String diyName, String diyPrice, String diyCategory) {
        Image_URL = image_URL;
        this.diyName = diyName;
        this.diyPrice = diyPrice;
        this.diyCategory = diyCategory;
    }

    public DIYitem(){
    }

    public String getImage_URL() {
        return Image_URL;
    }

    public void setImage_URL(String image_URL) {
        Image_URL = image_URL;
    }

    public String getDiyName() {
        return diyName;
    }

    public void setDiyName(String diyName) {
        this.diyName = diyName;
    }

    public String getDiyPrice() {
        return diyPrice;
    }

    public void setDiyPrice(String diyPrice) {
        this.diyPrice = diyPrice;
    }

    public String getDiyCategory() {
        return diyCategory;
    }

    public void setDiyCategory(String diyCategory) {
        this.diyCategory = diyCategory;
    }
}
