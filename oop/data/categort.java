package oop.data;

public class categort {

    private String  id;
    private  boolean expensive;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id != null){
            this.id = id;
        }
    }

    public boolean isExpensive(Object o) {
        return expensive;
    }

    public void setExpensive(boolean expensive) {
        this.expensive = expensive;
    }
}
