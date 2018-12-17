package com.etergo.techassessment;


//Place this under /src/test/java/com/etergo/techassessment/ZoomLevelRepositoryTest.java


import org.junit.Test;

import static org.junit.Assert.*;

public class ZoomLevelRepositoryTest {

    @Test
    public void zoomIn_positive(){
        ZoomLevelRepository zoomLevelRepository = new ZoomLevelRepository(100);
        assertTrue(zoomLevelRepository.zoomIn()==125);
    }

    @Test
    public void zoomIn_negative(){
        ZoomLevelRepository zoomLevelRepository = new ZoomLevelRepository(200);
        assertTrue(zoomLevelRepository.zoomIn()==200);
    }

    @Test
    public void zoomOut_positive(){
        ZoomLevelRepository zoomLevelRepository = new ZoomLevelRepository(100);
        assertTrue(zoomLevelRepository.zoomOut()==75);
    }

    @Test
    public void zoomOut_negative(){
        ZoomLevelRepository zoomLevelRepository = new ZoomLevelRepository(25);
        assertTrue(zoomLevelRepository.zoomOut()==25);
    }

    @Test
    public void getZoomValueTest(){
        ZoomLevelRepository zoomLevelRepository = new ZoomLevelRepository(100);
        assertTrue(zoomLevelRepository.getZoomValue()==100);
    }
}