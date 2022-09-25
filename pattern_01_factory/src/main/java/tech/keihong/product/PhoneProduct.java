package tech.keihong.product;

public abstract class PhoneProduct {
    private int battery = 100;
    private String screen;
    private String communication;
    private String camera;
    private String name;

    public void show() {
        System.out.printf("产品信息：\n名称: %s\n屏幕大小: %s\n摄像头: %s\n通信: %s\n", name, screen, camera, communication);
    }

    public void charge() {
        int time = battery / chargeSpeed();
        System.out.printf("充电时间:%d分钟\n\n", time);
    }

    protected abstract int chargeSpeed();

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public void setCommunication(String communication) {
        this.communication = communication;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public void setName(String name) {
        this.name = name;
    }
}
