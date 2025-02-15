// Single Responsibility Principle states that a class should have only one reason to change.
// This means that a class should have only one job and should change for only one reason.

//It makes it *1.easy to maintain* and *2.easy to understand*.

#include <bits/stdc++.h>
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

// only change for calculation Logic
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

// only change for database Logic like change in database url etc.
class InvoiceDao {
public:
    Invoice invoice;

    InvoiceDao(Invoice invoice) {
        this->invoice = invoice;
    }
    void saveToDB(Marker marker) {
        // save marker to database
    }
};

// only change for printing Logic like change in printing format etc.
class InvoicePrinter {
public:
    Invoice invoice;

    InvoicePrinter(Invoice invoice) {
        this->invoice = invoice;
    }
};

int main() {

    return 0;
}