package com.github.alarit.collinearpoints.service;

import org.junit.Before;
import org.junit.Test;

public class CollinearPointsServiceTest {

    private CollinearPointsService service;

    @Before
    public void setup() {
        service = new CollinearPointsService();
    }

    @Test(expected = IllegalArgumentException.class)
    public void addPointToSpaceNullTest() {
        service.addPointToSpace(null);
    }

}