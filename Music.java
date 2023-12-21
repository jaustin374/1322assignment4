public class Music extends Media implements IAudioStandard {
    private String audioCodec;

    public Music(String n, String aC) {
        super(n);
        audioCodec = aC;
    }

    @Override
    public String getAudioCodec() {
        return "Audio codec: "+audioCodec;
    }

    @Override
    public String getMediaInfo() {
        return "Music ID: "+getId()+"\nMusic name: "+getFileName()+"\nAudio Codec: "+audioCodec;
    }
}
