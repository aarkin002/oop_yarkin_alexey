public class People implements Actn {
    private String name;
    private Integer run_lngth;
    private Integer jump_hgth;


    public People(String name, Integer run_lngth, Integer jump_hght) {
        this.name = name;
        this.run_lngth = run_lngth;
        this.jump_hgth = jump_hght;

    }

    @Override
    public void jump(Wall wall) {
        int h = wall.getHght();
        if(h <= jump_hgth) {
            System.out.printf("Человек перепрыгнул %s%n", h);
        }
    }
    @Override
    public void run(Treadmill treadmill) {
        int l = treadmill.getLngth();
        if(l <= run_lngth){
            System.out.printf("Человек пробежал %s%n", l);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRun_lngth() {
        return run_lngth;
    }

    public void setRun_lngth(Integer run_lngth) {
        this.run_lngth = run_lngth;
    }

    public Integer getJump_hgth() {
        return jump_hgth;
    }

    public void setJump_hgth(Integer jump_hgth) {
        this.jump_hgth = jump_hgth;
    }
}
