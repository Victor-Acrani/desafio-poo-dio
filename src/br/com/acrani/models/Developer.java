package br.com.acrani.models;

import br.com.acrani.interfaces.IDeveloper;

import java.util.LinkedHashSet;
import java.util.Set;

public class Developer implements IDeveloper {
    private String name;
    private Set<Content> subscribedContents = new LinkedHashSet<>();
    private Set<Content> finishedContents = new LinkedHashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getSubscribedContents() {
        return subscribedContents;
    }

    public void setSubscribedContents(Set<Content> subscribedContents) {
        this.subscribedContents = subscribedContents;
    }

    public Set<Content> getFinishedContents() {
        return finishedContents;
    }

    public void setFinishedContents(Set<Content> finishedContents) {
        this.finishedContents = finishedContents;
    }

    @Override
    public void subscribeBootcamp(Bootcamp bootcamp) {
        System.out.println("not done yet");
    }

    @Override
    public void progress() {
        System.out.println("not done yet");
    }

    @Override
    public void calculateXP() {
        System.out.println("not done yet");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Developer developer = (Developer) o;

        if (name != null ? !name.equals(developer.name) : developer.name != null) return false;
        if (subscribedContents != null ? !subscribedContents.equals(developer.subscribedContents) : developer.subscribedContents != null)
            return false;
        return finishedContents != null ? finishedContents.equals(developer.finishedContents) : developer.finishedContents == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (subscribedContents != null ? subscribedContents.hashCode() : 0);
        result = 31 * result + (finishedContents != null ? finishedContents.hashCode() : 0);
        return result;
    }
}
