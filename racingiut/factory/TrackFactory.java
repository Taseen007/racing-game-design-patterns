package factory;

import track.Track;

public interface TrackFactory {
    Track createTrack(String type);
}