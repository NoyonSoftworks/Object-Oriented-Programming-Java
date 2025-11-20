//Interface create
interface Controllable {
    void powerOn();
    void powerOff();
    String getStatus();
}
class Television implements Controllable {
    private boolean isOn;

    @Override
    public void powerOn(){
        isOn = true;
        System.out.println("Television is powered ON.");
    }
    @Override
    public void powerOff(){
        isOn = false;
        System.out.println("Television is powered OFF.");
    }
    @Override
    public String getStatus(){
        return isOn ? "Television is ON" : "Television is OFF";
    }
}
class Lamp implements Controllable {
    private boolean isLit;
    @Override
    public void powerOn(){
        isLit = true;
        System.out.println("Lamp is now ON. The lamp is lit.");
    }
    @Override
    public void powerOff(){
        isLit = false;
        System.out.println("Lamp is now OFF. The lamp is unlit.");
    }
    @Override
    public String getStatus(){
        return isLit ? "Lamp is ON" : "Lamp is OFF";
    }
}
//main class
public class DeviceControlTest {
    public static void main(String[] args) {
        //array of controllable (Polymorphism)
        Controllable[] devices = new Controllable[2];
        devices[0] = new Television();
        devices[1] = new Lamp();

        //When turn on all devices
        System.out.println("--Turning ON all devices--");
        for(Controllable device : devices){
            device.powerOn();
            System.out.println(device.getStatus());
            System.out.println();
        }
        //When turn off all devices
        System.out.println("--Turning OFF all devices--");
        for(Controllable device : devices){
            device.powerOff();
            System.out.println(device.getStatus());
            System.out.println();
        }
    }
    
}
