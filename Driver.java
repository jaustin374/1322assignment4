import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        ArrayList<Media> allMedia = new ArrayList<Media>();
        Scanner myScan = new Scanner(System.in);

        int menuSelection;

        do {
            System.out.print("1- Add Image\n2- Add Music\n3- Add Video\n" +
                    "4- Show images\n5- Show music\n6- Show videos\n7- Show images and videos\n" +
                    "8- Show music and videos\n9- Exit\nEnter option: ");
            menuSelection = Integer.parseInt(myScan.nextLine());

            if (menuSelection == 1) {
                System.out.print("Enter file name: ");
                String fileName = myScan.nextLine();
                System.out.print("Enter image codec: ");
                String imageCodec = myScan.nextLine();
                Image newImage = new Image(fileName, imageCodec);
                allMedia.add(newImage);
            }
            else if (menuSelection == 2) {
                System.out.print("Enter file name: ");
                String fileName = myScan.nextLine();
                System.out.print("Enter audio codec: ");
                String audioCodec = myScan.nextLine();
                Music newMusic = new Music(fileName, audioCodec);
                allMedia.add(newMusic);
            }
            else if (menuSelection == 3) {
                System.out.print("Enter file name: ");
                String fileName = myScan.nextLine();
                System.out.print("Enter image codec: ");
                String imageCodec = myScan.nextLine();
                System.out.print("Enter audio codec: ");
                String audioCodec = myScan.nextLine();
                Video newVideo = new Video(fileName, imageCodec, audioCodec);
                allMedia.add(newVideo);
            }
            else if (menuSelection == 4) {
                for (int i = 0; i < allMedia.size(); i++) {
                    if (allMedia.get(i) instanceof Image) {
                        System.out.println(((Image)allMedia.get(i)).getMediaInfo());
                    }
                }
            }
            else if (menuSelection == 5) {
                for (int i = 0; i < allMedia.size(); i++) {
                    if (allMedia.get(i) instanceof Music) {
                        System.out.println(((Music)allMedia.get(i)).getMediaInfo());
                    }
                }
            }
            else if (menuSelection == 6) {
                for (int i = 0; i < allMedia.size(); i++) {
                    if (allMedia.get(i) instanceof Video) {
                        System.out.println(((Video)allMedia.get(i)).getMediaInfo());
                    }
                }
            }
            else if (menuSelection == 7) {
                for (int i = 0; i < allMedia.size(); i++) {
                    if (allMedia.get(i) instanceof IImageStandard) {
                        System.out.println(((IImageStandard)allMedia.get(i)).getMediaInfo());
                    }
                }
            }
            else if (menuSelection == 8) {
                for (int i = 0; i < allMedia.size(); i++) {
                    if (allMedia.get(i) instanceof IAudioStandard) {
                        System.out.println(((IAudioStandard)allMedia.get(i)).getMediaInfo());
                    }
                }
            }
        } while (menuSelection != 9);
        System.out.println("Shutting down...");
    }
}
