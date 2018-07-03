package nayeem.recyclerviewjasonparse;

/**
 * Created by Lenovo on 7/1/2018.
 */

public class listView {
    private String head;
    private String desc;
    private String imageurl;

    public String getHead() {
        return head;
    }

    public String getDesc() {
        return desc;
    }

    public String getImageurl() {
        return imageurl;
    }

    public listView(String head, String desc, String imageurl) {

        this.head = head;
        this.desc = desc;
        this.imageurl = imageurl;
    }
}
