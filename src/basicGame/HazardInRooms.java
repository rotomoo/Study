package basicGame;

import java.util.*;

public class HazardInRooms {
    public static void main(String[] args) {
        int[] rooms = {0, 1, 2, 3};

        String bat = "Bat";
        String pit = "Pit";
        String wumpus = "Wumpus";
        String nothing = "Nothing";

        String[] hazards = {nothing, bat, pit, wumpus};

        Map<String, String> hazardMessages = new HashMap<>();

        hazardMessages.put(bat, "\"어디선가 부스럭거리는 소리가 들린다.\"");
        hazardMessages.put(wumpus, "\"어디선가 끔찍한 냄새가 난다.\"");
        hazardMessages.put(pit, "\"바람이 부는 소리가 들리는 것 같다.\"");
        hazardMessages.put(nothing, "\"저 방에는 아무것도 없는 것 같다.\"");

        int[][] links = {{1, 2, 3}, {2, 3, 0}, {3, 0, 1}, {0, 1, 2}};

        int currentRoom = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("지금 " + currentRoom + "번 방에 있습니다.");

            int[] nextRooms = links[currentRoom];

            for (int nextRoom : nextRooms) {
                String harard = hazards[nextRoom];
                String message = hazardMessages.get(harard);
                System.out.println(message);
            }

            
            System.out.println("다음 번호중에서 이동할 방 번호를 입력해주세요.");
            System.out.println(Arrays.toString(nextRooms));

            int roomNumber = scanner.nextInt();

            currentRoom = roomNumber;

            String hazardInRoom = hazards[currentRoom];

            Random random = new Random();

            if (hazardInRoom.equals(wumpus)) {
                System.out.println("움퍼스에게 잡아먹혔습니다.");
            } else if (hazardInRoom.equals(pit)) {
                System.out.println("구덩이에 빠졌습니다.");
            } else if (hazardInRoom.equals(bat)) {
                System.out.println("박쥐가 당신을 잡아 다른 방에 떨어트렸습니다.");
                do {
                    currentRoom = random.nextInt(rooms.length);
                } while (hazards[currentRoom].equals(bat));
                }
            while (true) {
                int newBatRoom = random.nextInt(rooms.length);
                if (newBatRoom == currentRoom) {
                    continue;
                }
                if (hazards[newBatRoom].equals(nothing)) {
                    hazards[newBatRoom] = bat;
                    break;
                }
            }
            }
    }
}
