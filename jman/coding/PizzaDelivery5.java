public class PizzaDelivery5 {

    public static double calculateDistance(int[] point1, int[] point2) {
        int x1 = point1[0];
        int y1 = point1[1];
        int x2 = point2[0];
        int y2 = point2[1];

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return distance;
    }

    public static double findMaxTravelTime(int speed, int[][] locations) {
        double maxTravelTime = 0;

        for (int i = 0; i < locations.length - 1; i++) {
            for (int j = i + 1; j < locations.length; j++) {
                double distance = calculateDistance(locations[i], locations[j]);
                double travelTime = distance / speed;

                if (travelTime > maxTravelTime) {
                    maxTravelTime = travelTime;
                }
            }
        }

        // Round off to 6 decimal places
        maxTravelTime = Math.round(maxTravelTime * 1e6) / 1e6;
        return maxTravelTime;
    }

    public static void main(String[] args) {
        // Example usage:
        int speed = 2;
        int X = 3;
        int[][] locations = {{0, 0}, {0, 2}, {2, 0}};

        double result = findMaxTravelTime(speed, locations);
        System.out.println(result);
    }
}
