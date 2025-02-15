// if class B is subtype of class A (child class of A), 
// then we should be able to replace object of A with B without disrupting the behavior of the program
// Subclass should extend the capability of the parent class and not narrow it down

#include<bits/stdc++.h>
using namespace std;

class Bike {
    public:
        virtual void turnOnEngine() = 0;
        virtual void accelerate() = 0;
};

class MotorCycle : public Bike {
    bool isEngineOn;
    int speed;

    void turnOnEngine() {
        isEngineOn = true;
    }

    void accelerate() {
        speed += 10;
    }
};

class Bicycle : public Bike {
    int batteryPercentage;
    int speed;

    // this function narrows the capability of Bike class as turnOnEngine is not applicable for Bicycle
    void turnOnEngine() {
        throw "No engine";
    }

    void accelerate() {
        speed += 5;
    }
};