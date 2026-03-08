# Racing Game Design Patterns

A Java-based racing game project demonstrating the implementation of three major design patterns: **Strategy**, **Factory**, and **Decorator**.

## Project Structure

```
racingiut/
│
├── main/
│   └── Rii.java                    # Main entry point
│
├── player/
│   └── Player.java                 # Player class
│
├── car/                            # Car classes
│   ├── Car.java                    # Base car class
│   ├── CoupeCar.java               # Coupe type car
│   ├── RoadsterCar.java            # Roadster type car
│   ├── ToyotaGR86.java             # Toyota GR86 implementation
│   ├── SubaruBRZ.java              # Subaru BRZ implementation
│   ├── PorscheBoxster.java         # Porsche Boxster implementation
│   └── Ferrari812.java             # Ferrari 812 implementation
│
├── strategy/                       # Strategy Pattern - Engine & Turbo behaviors
│   ├── EngineBehavior.java         # Engine behavior interface
│   ├── V6Engine.java               # V6 engine implementation
│   ├── V8Engine.java               # V8 engine implementation
│   ├── V12Engine.java              # V12 engine implementation
│   ├── TurboBehavior.java          # Turbo behavior interface
│   ├── AlpineTurbo.java            # Alpine turbo implementation
│   ├── CumminsTurbo.java           # Cummins turbo implementation
│   └── HoneywellTurbo.java         # Honeywell turbo implementation
│
├── factory/                        # Factory Pattern - Car & Track creation
│   ├── CarFactory.java             # Car factory interface
│   ├── CoupeFactory.java           # Coupe car factory
│   ├── RoadsterFactory.java        # Roadster car factory
│   ├── TrackFactory.java           # Track factory interface
│   ├── TrackFactoryImpl.java       # Track factory implementation
│   └── GameSetup.java              # Game setup and configuration
│
├── track/                          # Racing tracks
│   ├── Track.java                  # Base track class
│   ├── BlueMoonBay.java            # Blue Moon Bay track
│   ├── BBRaceway.java              # BB Raceway track
│   └── SpaFrancorchamps.java       # Spa-Francorchamps track
│
├── decorator/                      # Decorator Pattern - NOS systems
│   ├── CarDecorator.java           # Base car decorator
│   ├── ResonacNOS.java             # Resonac NOS system
│   └── SemaNOS.java                # Sema NOS system
│
└── race/                           # Race types
    ├── Race.java                   # Base race class
    ├── SprintRace.java             # Sprint race implementation
    └── CircuitRace.java            # Circuit race implementation
```

## Design Patterns Used

### 1. Strategy Pattern
**Location:** `strategy/` package

The Strategy pattern is used to define different engine and turbo behaviors that can be dynamically assigned to cars at runtime.

- **EngineBehavior**: Interface for different engine types (V6, V8, V12)
- **TurboBehavior**: Interface for different turbo systems

### 2. Factory Pattern
**Location:** `factory/` package

The Factory pattern is used to create different types of cars and racing tracks without specifying their exact classes.

- **CarFactory**: Creates different car types (Coupe, Roadster)
- **TrackFactory**: Creates different racing tracks

### 3. Decorator Pattern
**Location:** `decorator/` package

The Decorator pattern is used to dynamically add NOS (Nitrous Oxide System) enhancements to cars without modifying their base structure.

- **CarDecorator**: Base decorator for adding features to cars
- **ResonacNOS** & **SemaNOS**: Different NOS system implementations

## Components

### Cars
- **Base Classes**: Car, CoupeCar, RoadsterCar
- **Specific Models**: Toyota GR86, Subaru BRZ, Porsche Boxster, Ferrari 812

### Tracks
- Blue Moon Bay
- BB Raceway
- Spa-Francorchamps

### Race Types
- Sprint Race
- Circuit Race

## Design Pattern Implementation Details

### Strategy Pattern ✓
**Purpose:** Define a family of algorithms, encapsulate each one, and make them interchangeable.

- **Behavioral Interfaces:** `EngineBehavior`, `TurboBehavior`
- **Concrete Strategies:** 
  - Engines: `V6Engine`, `V8Engine`, `V12Engine`
  - Turbos: `AlpineTurbo`, `CumminsTurbo`, `HoneywellTurbo`
- **Context:** `Car` class delegates behavior to strategy objects
- **Benefit:** Engine and turbo behaviors can be changed at runtime

### Factory Pattern ✓
**Purpose:** Define an interface for creating objects, but let subclasses decide which class to instantiate.

- **Factory Interfaces:** `CarFactory`, `TrackFactory`
- **Concrete Factories:** 
  - `CoupeFactory` (creates Toyota GR86, Subaru BRZ)
  - `RoadsterFactory` (creates Porsche Boxster, Ferrari 812)
  - `TrackFactoryImpl` (creates tracks)
- **Benefit:** Decouples object creation from usage

### Decorator Pattern ✓
**Purpose:** Attach additional responsibilities to an object dynamically.

- **Component:** `Car` abstract class
- **Decorator:** `CarDecorator` abstract class
- **Concrete Decorators:** `ResonacNOS`, `SemaNOS`
- **Benefit:** Add NOS functionality without modifying car classes

### Template Method Pattern ✓
**Purpose:** Define the skeleton of an algorithm, deferring some steps to subclasses.

- **Template Class:** `Race` with `race()` template method
- **Concrete Implementations:** `SprintRace`, `CircuitRace`
- **Benefit:** Race flow is consistent while allowing customization

### Singleton Pattern ✓
**Purpose:** Ensure a class has only one instance and provide global access.

- **Implementation:** `Player` class
- **Benefit:** Single player instance throughout the game

## SOLID Principles Compliance

✅ **Single Responsibility Principle (SRP)**
- Each class has one reason to change
- Separate classes for cars, tracks, races, factories

✅ **Open/Closed Principle (OCP)**
- Open for extension through inheritance and interfaces
- Closed for modification - add new cars/tracks without changing existing code

✅ **Liskov Substitution Principle (LSP)**
- All subclasses can substitute their parent classes
- `CarDecorator` properly delegates all methods

✅ **Interface Segregation Principle (ISP)**
- Small, focused interfaces (`EngineBehavior`, `TurboBehavior`, `Track`, `CarFactory`)
- Clients only depend on methods they use

✅ **Dependency Inversion Principle (DIP)**
- High-level modules depend on abstractions
- `Car` depends on `EngineBehavior` and `TurboBehavior` interfaces, not concrete implementations

## Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Java compiler (javac)

### Running the Application

1. Compile all Java files:
```bash
javac racingiut/**/*.java
```

2. Run the main class:
```bash
java racingiut.main.Rii
```

3. Follow the interactive prompts to:
   - Enter player name
   - Choose car category (coupe/roadster)
   - Select specific car model
   - Configure engine (v6/v8/v12)
   - Configure turbo (alpine/cummins/honeywell)
   - Select track (blue/bb/spa)
   - Choose race type (sprint/circuit)

### Example Run
```
Enter Player Name:
John
Player: John
Choose Car Category (coupe/roadster):
coupe
Choose Car:
toyota
Choose Engine (v6/v8/v12):
v8
Choose Turbo (alpine/cummins/honeywell):
alpine
Choose Track (blue/bb/spa):
blue
Choose Race Type (sprint/circuit):
sprint
```

