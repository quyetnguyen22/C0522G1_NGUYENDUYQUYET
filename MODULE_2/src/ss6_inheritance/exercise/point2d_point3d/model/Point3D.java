package ss6_inheritance.exercise.point2d_point3d.model;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {

    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[]{getX(), getY(), getZ()};
    }

    @Override
    public String toString() {
        return (super.toString() + "\n[3D]: (" + getX() + ", " + getY() +  ", " + getZ() + ")");
    }
}
