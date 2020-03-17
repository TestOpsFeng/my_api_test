package top.testops.my_api_test.dao.been.body;

/**
  * @ClassName AssignPlannerBody
  * @Description TODO
  * @author carson
  * @date 2020/3/16
**/
public class AssignPlannerBody {

    /**
     * id : 324
     * plannerId : 42
     */

    private int id;
    private int plannerId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPlannerId() {
        return plannerId;
    }

    public void setPlannerId(int plannerId) {
        this.plannerId = plannerId;
    }
}
