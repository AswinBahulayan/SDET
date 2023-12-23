package Homework;

import java.util.*;

public class REQUESTS {


    public static List<String> getRequestStatus(List<String> requests) {
        Map<String, Queue<Integer>> domainRequests = new HashMap<>();
        List<String> result = new ArrayList<>();

        for (String request : requests) {
            String[] parts = request.split("\\.");
            String domain = parts[1]; // Extracting the domain from the request URL

            if (!domainRequests.containsKey(domain)) {
                domainRequests.put(domain, new LinkedList<>());
            }

            Queue<Integer> queue = domainRequests.get(domain);
            int currentTime = Integer.parseInt(parts[0]);

            while (!queue.isEmpty() && currentTime - queue.peek() >= 30) {
                queue.poll(); // Remove requests older than 30 seconds
            }

            while (!queue.isEmpty() && currentTime - queue.peek() >= 5) {
                queue.poll(); // Remove requests older than 5 seconds
            }

            if (queue.size() < 5 && domainRequests.values().stream().mapToInt(Queue::size).sum() < 20) {
                queue.offer(currentTime); // Add current request time to the domain's queue
                result.add("(status: 200, message: OK)");
            } else {
                result.add("(status: 429, message: Too many requests)");
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<String> requests = Arrays.asList(
                "1.www.xyz.com", "2.www.abc.com", "3.www.xyz.com", "4.www.pqr.com",
                "5.www.abc.com", "6.www.xyz.com", "7.www.xyz.com", "8.www.abc.com", "9.www.xvz.com"
        );

        List<String> status = getRequestStatus(requests);
        System.out.println(status);
    }
}
