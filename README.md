# Shapes Manager

**Developer:** Saad

---

## Overview
Shapes Manager is a simple Java application to manage different geometric shapes.  
Each shape is represented by its own class, allowing easy expansion and maintainability.  
This is currently an **alpha version**, with plans for a full GUI and additional features in the future.

---

## Features
- Create and manage different types of shapes.
- Calculate area and Cirumferemce  for each shape.
- Fully object-oriented design with separate classes for each shape.
- Easy to extend with new shapes.

---

## Version
- Current version: 0.1-alpha
- Last update: 2025-09-04

## Getting Started

### Prerequisites
- Java 8 or higher
- IDE such as IntelliJ IDEA or Eclipse (optional)

### How to Run
1. Clone the repository:
```bash
git clone https://github.com/ixSaad/ShapesManger.git

    2.    Open the project in your IDE.
    3.    Compile and run the Main class.

⸻

Example Usage

// Create a circle with radius 5
Circle circle = new Circle(5);
System.out.println("Area: " + circle.calculateArea());
System.out.println("Cirumferemce : " + circle.calculateCirumferemce ());

// Create a rectangle with width 4 and height 6
Rectangle rectangle = new Rectangle(4, 6);
System.out.println("Area: " + rectangle.calculateArea());
System.out.println("Cirumferemce : " + rectangle.calculateCirumferemce ());


⸻

Future Plans
    •    Add a graphical user interface (GUI) for easier interaction.
    •    Support saving and loading shapes from files.
    •    Add more shapes and complex operations.
    •    Implement unit tests to ensure reliability.

⸻

License

This project is licensed under the MIT License.