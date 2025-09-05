# Facade vs Adapter Design Patterns

The **Facade** and **Adapter** design patterns both simplify interaction with existing code, but their primary intents differ:

---

## Facade Pattern

- **Intent:**  
  Provide a simplified, unified interface to a complex subsystem. It hides the complexity of multiple classes and their interactions, making the subsystem easier to use for clients.

- **Mechanism:**  
  Creates a new, simpler interface that delegates calls to the appropriate objects within the subsystem. The facade doesn't add new functionality but simplifies access to existing functionality.

- **Analogy:**  
  Think of a car's dashboard. You press a single "start engine" button, but behind the scenes, the car's engine, fuel system, and electrical system are all coordinated. The dashboard is the facade.

---

## Adapter Pattern

- **Intent:**  
  Convert the interface of a class into another interface that clients expect. It allows classes with incompatible interfaces to work together.

- **Mechanism:**  
  Wraps an existing class (the adaptee) and exposes an interface that the client can understand. The adapter translates calls from the client's expected interface to the adaptee's interface.

- **Analogy:**  
  Think of a universal power adapter for electronics. It allows a device with one type of plug to connect to an outlet with a different type of socket, making them compatible.

---

## Key Difference Summarized

- **Facade:** Simplifies a complex subsystem by providing a new, unified interface.
- **Adapter:** Makes incompatible interfaces compatible by converting one interface to