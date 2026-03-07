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
│   └── TrackCreator.java           # Track creator implementation
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

## Getting Started

*Instructions for running the application will be added once implementation is complete.*

## License

*License information to be added.*