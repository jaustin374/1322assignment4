public class Video extends Media implements IImageStandard, IAudioStandard {
    private String imageCodec;
    private String audioCodec;

    public Video(String n, String iC, String aC) {
        super(n);
        imageCodec = iC;
        audioCodec = aC;
    }

    @Override
    public String getImageCodec() {
        return "Image codec: "+imageCodec;
    }

    @Override
    public String getAudioCodec() {
        return "Audio codec: "+audioCodec;
    }

    @Override
    public String getMediaInfo() {
        return "Video ID: "+getId()+"\nVideo Name: "+getFileName()+"\nImage Codec: "+imageCodec+"\nAudio Codec: "+audioCodec;
    }
}
