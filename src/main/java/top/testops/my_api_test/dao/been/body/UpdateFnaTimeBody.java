package top.testops.my_api_test.dao.been.body;

/**
  * @ClassName UpdateFnaTimeBody
  * @Description TODO
  * @author carson
  * @date 2020/3/16
**/
public class UpdateFnaTimeBody {

    /**
     * id : 340
     * fnaTime : 2020-03-15 12:00:00
     */

    private int id;
    private String fnaTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFnaTime() {
        return fnaTime;
    }

    public void setFnaTime(String fnaTime) {
        this.fnaTime = fnaTime;
    }
}
