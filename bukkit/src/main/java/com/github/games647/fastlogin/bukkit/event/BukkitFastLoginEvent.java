package com.github.games647.fastlogin.bukkit.event;

import com.github.games647.fastlogin.core.PremiumStatus;
import com.github.games647.fastlogin.core.shared.event.FastLoginEvent;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class BukkitFastLoginEvent extends Event implements FastLoginEvent {

    private static final HandlerList HANDLERS = new HandlerList();
    private final String username;
    private final PremiumStatus status;

    public BukkitFastLoginEvent(String username, PremiumStatus status) {
        super(true);

        this.username = username;
        this.status = status;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public PremiumStatus getStatus() {
        return status;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }
}