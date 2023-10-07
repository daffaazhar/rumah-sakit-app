package services;

import models.RumahSakit;

public class DatabaseService {
    private static RumahSakit rumahSakit;
    
    public static RumahSakit getRumahSakit() {
        if (rumahSakit == null)
            rumahSakit = new RumahSakit();
        return rumahSakit;
    }
}
