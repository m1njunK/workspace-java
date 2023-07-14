package test_A_2_2;

public class Car {
String color;
int speed;
int gear;

Car(){}

Car(String color, int speed, int gear) {
	this.color = color;
	this.speed = speed;
	this.gear = gear;
}

String showInfo(){
        return "Car [color="+color+", speed="+speed+", gear="+gear+"]";
};

int speedUp(){
        return speed = speed+10;
}

int speedDown() {
        return speed = speed-10;
}
}