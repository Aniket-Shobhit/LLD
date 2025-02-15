// A class should be open for extension but closed for modification
// member functions should not be added directly to the class, but through inheritance or implementing an interface or virtual function

#include<bits/stdc++.h>
using namespace std;

class Marker {
public:
    string name;
    string color;
    int year;
    int price;

    Marker(string name, string color, int year, int price) {
        this->name = name;
        this->color = color;
        this->year = year;
        this->price = price;
    }
};


class Invoice {
private:
    Marker marker;
    int quantity;

    Invoice(Marker marker, int quantity) {
        this->marker = marker;
        this->quantity = quantity;
    }

    int caculateTotal() {
        int price = ((marker.price) * this->quantity);
        return price;
    }
};

// no need to change InvoiceDao, if we want to add something, we simply create a class that inherits InvoiceDao

class InvoiceDao {
    public: 
        virtual void save(Invoice invoice) = 0;
};

class DatabaseInvoiceDao : public InvoiceDao {
    public:
    // override
        void save(Invoice invoice) {
            // save to database
        }
};

class FileInvoiceDao : public InvoiceDao {
    public:
    // override
        void save(Invoice invoice) {
            // save to file
        }
};

int main() {
    
    return 0;
}