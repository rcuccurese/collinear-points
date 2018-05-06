package com.github.alarit.collinearpoints.model;

import com.github.alarit.collinearpoints.exception.InvalidLineException;
import org.junit.Test;

import static org.junit.Assert.*;

public class LineTest {

    @Test
    public void fillLineValidPointsTest() {

        int errorsCount = 0;
        try {
            Line l = Line.of(null, Point.of(1.1d, 5.5d));
        } catch (InvalidLineException e) {
            errorsCount++;
        }

        try {
            Point p1 = Point.of(1.0d, 5.5d);

            Line l = Line.of(p1, p1);
        } catch (InvalidLineException e) {
            errorsCount++;
        }

        //Checking valid points throw no exception
        try {
            Point p1 = Point.of(1.0d, 5.5d);
            Point p2 = Point.of(3.3d, 4.4d);

            Line l = Line.of(p1, p2);
        } catch (InvalidLineException e) {
            errorsCount++;
        }

        assertTrue(errorsCount == 2);
    }

}