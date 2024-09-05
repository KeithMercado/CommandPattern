public class ViewerApp {
    public static void main(String[] args){
        Tv tv = new Tv();
        Light light = new Light();
        Thermostat thermostat = new Thermostat();
        MusicPlayer musicPlayer = new MusicPlayer();
        RemoteControl rc = new RemoteControl();

        PowerOn powerOn = new PowerOn(tv);
        System.out.println(powerOn.execute());

        PowerOff powerOff = new PowerOff(tv);
        System.out.println(powerOff.execute());

        LightsPowerOn lightsPowerOn = new LightsPowerOn(light);
        System.out.println(lightsPowerOn.execute());

        BrightnessRaise brightnessRaise = new BrightnessRaise(light);
        System.out.println(brightnessRaise.execute());

        BrightnessLower brightnessLower = new BrightnessLower(light);
        System.out.println(brightnessLower.execute());

        LightsPowerOff lightsPowerOff = new LightsPowerOff(light);
        System.out.println(lightsPowerOff.execute());

        TempIncrease tempIncrease = new TempIncrease(thermostat);
        System.out.println(tempIncrease.execute());

        TempDecrease tempDecrease = new TempDecrease(thermostat);
        System.out.println(tempDecrease.execute());

        MusicOn musicOn = new MusicOn(musicPlayer);
        System.out.println(musicOn.execute());

        MusicNext musicNext = new MusicNext(musicPlayer);
        System.out.println(musicNext.execute());

        MusicLast musicLast = new MusicLast(musicPlayer);
        System.out.println(musicLast.execute());

        MusicOff musicOff = new MusicOff(musicPlayer);
        System.out.println(musicOff.execute());


    }
}