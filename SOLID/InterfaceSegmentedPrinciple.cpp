// interface should be such, that client should implement unnecessary functions they do not need

#include<bits/stdc++.h>
using namespace std;

class RestaurantEmployee {
    public:
        virtual void washDishes() = 0;
        virtual void serveCustomers() = 0;
        virtual void cookFood() = 0;
};

class Waiter : public RestaurantEmployee {
    public:
        void washDishes() {
            // not my job
        }

        void serveCustomers() {
            // serve customers
        }

        void cookFood() {
            // not my job
        }
};

// here implementation of washDishes and cookFood is not needed, so we can create a new smaller multiple interfaces  

class WaiterInterface {
    public:
        virtual void serveCustomers() = 0;
        virtual void takeOrder() = 0;
};

class ChefInterface {
    public:
        virtual void cookFood() = 0;
        virtual void decideMenu() = 0;
};

class Waiter : public WaiterInterface {
    public: 
        void serveCustomers() {
            // serve customers
        }

        void takeOrder() {
            // take order
        }
};
// here implementation of waiterInterface is done fully