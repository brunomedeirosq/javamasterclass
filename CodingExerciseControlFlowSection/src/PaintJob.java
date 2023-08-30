public class PaintJob {

    public static int getBucketCount (double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }

        //declare variables
        double area = width * height;
        double buckets = getBucketCount(area,areaPerBucket) - extraBuckets;
        if (buckets < 0) {
            return 0;
        }

        return (int)buckets;


    }

    public static int getBucketCount (double width, double height, double areaPerBucket) {

        return getBucketCount(width, height,areaPerBucket,0);

    }

    public static int getBucketCount (double area, double areaPerBucket) {

        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        //The ceil() method rounds the specified double value upward and returns it.
        double buckets = Math.ceil((area/areaPerBucket));
        if (buckets < 0) {
            return 0;
        }

        return (int)buckets;

    }

}
