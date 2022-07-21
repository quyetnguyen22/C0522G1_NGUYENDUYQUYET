package ss15_exception_debug.exercise.triangle.controller;

import ss15_exception_debug.exercise.triangle.service.ITriangleService;
import ss15_exception_debug.exercise.triangle.service.impl.TriangleService;

public class TriangleController {
    private static final ITriangleService ITRIANGLESERVICE = new TriangleService();
    public static void callTriangle() {
        ITRIANGLESERVICE.check();
    }
}
