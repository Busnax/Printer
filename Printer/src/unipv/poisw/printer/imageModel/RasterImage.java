package unipv.poisw.printer.imageModel;

import unipv.poisw.printer.colorModel.ColorRGB;

import java.util.HashMap;
import java.util.Map;

public class RasterImage implements Printable {
    private final double CONSUMPTION = 0.01;
    private Map<String, ColorRGB> pixels; // HashMap per i pixel
    private int nPixel;

    public RasterImage(int nPixel) {
        this.nPixel = nPixel;
        this.pixels = new HashMap<>();
        for (int i = 0; i < nPixel; i++) {
            for (int j = 0; j < nPixel; j++) {
                String key = i + "," + j; // Coordinate come chiave
                pixels.put(key, new ColorRGB());
            }
        }
    }
    public RasterImage(Map<String, ColorRGB> pixels, int nPixel) {
        this.pixels = pixels;
        this.nPixel = nPixel;
    }
    @Override
    public double inkNeeded() {
        return nPixel * nPixel * CONSUMPTION;
    }
    @Override
    public double getRedAmount() {
        double redAmount = 0;
        for (Map.Entry<String, ColorRGB> entry : pixels.entrySet()) {
            ColorRGB color = entry.getValue();
            if (color != null) {
                redAmount += color.getRed();
            }
        }
        return redAmount * CONSUMPTION;
    }
    @Override
    public double getGreenAmount() {
        double greenAmount = 0;
        for (Map.Entry<String, ColorRGB> entry : pixels.entrySet()) {
            ColorRGB color = entry.getValue();
            if (color != null) {
                greenAmount += color.getGreen();
            }
        }
        return greenAmount * CONSUMPTION;
    }
    @Override
    public double getBlueAmount() {
        double blueAmount = 0;
        for (Map.Entry<String, ColorRGB> entry : pixels.entrySet()) {
            ColorRGB color = entry.getValue();
            if (color != null) {
                blueAmount += color.getBlue();
            }
        }
        return blueAmount * CONSUMPTION;
    }
    @Override
    public String toString() {
        return "RasterImage [pixels=" + pixels + "]";
    }
}