package demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class RankedTalks implements Iterable<RankedTalk> {

    private List<RankedTalk> rankedTalks = new ArrayList<RankedTalk>();

    @Override
    public Iterator<RankedTalk> iterator() {
        return rankedTalks.iterator();
    }

    public void add(RankedTalk rankedTalk) {
        rankedTalks.add(rankedTalk);
    }

    @Override
    public void forEach(Consumer<? super RankedTalk> action) {

    }

    @Override
    public Spliterator<RankedTalk> spliterator() {
        return null;
    }
}
