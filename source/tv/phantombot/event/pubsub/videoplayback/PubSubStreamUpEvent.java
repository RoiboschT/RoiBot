/*
 * Copyright (C) 2016-2024 phantombot.github.io/PhantomBot
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package tv.phantombot.event.pubsub.videoplayback;

/**
 * @deprecated Stream up/down is now handeled by EventSub
 */
@Deprecated(since = "3.8.0.0", forRemoval = true)
public class PubSubStreamUpEvent extends PubSubVideoPlaybackEvent {

    private final int playDelay;

    /**
     * Constructor.
     *
     * @param channelId
     * @param serverTime
     * @param playDelay
     */
    public PubSubStreamUpEvent(int channelId, float serverTime, int playDelay) {
        super(channelId, serverTime);
        this.playDelay = playDelay;
    }

    /**
     * Method that returns the play delay.
     *
     * @return playDelay
     */
    public int getPlayDelay() {
        return this.playDelay;
    }
}
