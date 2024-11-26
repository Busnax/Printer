# Color Printer Simulation Project

## Project Description

This project simulates an inkjet printer with support for printing raster and vector images. It includes features for managing colors, calculating ink consumption, and handling printing-related errors.

### Project Structure

The project is organized into multiple packages and includes the following main components:

1. **Color Model (`colorModel`)**  
   - Management of RGB colors with the `ColorRGB` class and an enum `Color` representing primary color components (Red, Green, Blue).  
   - The `ColorRGB` class allows creating specific colors, generating random colors, and comparing colors based on their RGB components.

2. **Exceptions (`exceptions`)**  
   - `CartridgeEmptyException`: Thrown when a color component does not have enough ink to complete printing.  
   - `IllegalColorException`: Thrown when a color value is out of the acceptable range.  
   - `ShapesOutOfLimitException`: Thrown when trying to add too many shapes to a vector image.

3. **Image Model (`imageModel`)**  
   - `VectorImage`: Represents an image composed of colored geometric shapes and calculates ink consumption based on the total area of the shapes.  
   - `RasterImage`: Represents a raster image based on a matrix of colored pixels, with each pixel having a specific or random RGB color.  
   - `Printable` Interface: Defines common operations to calculate ink consumption and color quantities required for printing an image.

4. **Geometric Shapes (`imageModel.shapes`)**  
   - `Shape`: Abstract class representing a measurable geometric shape, including methods for calculating area, perimeter, and color percentages.  
   - Subclasses: `Circle`, `Rectangle`, and `Square`, each with specific attributes and methods.

5. **Inkjet Printer (`inkJetPrinter`)**  
   - `JetPrinter`: Simulates an inkjet printer with cartridges for each primary color (red, green, blue). Includes features for displaying ink levels, refilling cartridges, and printing images.  
   - `InkCartridge`: Manages the ink level of a single cartridge with methods to check its level and refill it.

### Key Features

- **Print Raster and Vector Images**: The printer can print both pixel-based raster images and shape-based vector images.  
- **Ink Consumption Calculation**: Each image determines ink consumption based on the total area and color components.  
- **Ink Level Management**: An exception is raised if the ink level is insufficient for printing.  
- **Color Management**: Full support for RGB colors with validation and comparison.
- **Packaging**: All files are organized in different packages.
