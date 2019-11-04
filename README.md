# dotfiles

hyPiRion's assorted collection of arcane setups.

Because it's always nice to have your setup in a repository, especially when
you're constantly experimenting with your setup.

## Setup

Right, there is a bit of setup before you can use everything. I'm going to write
a script to set this up but, in the meantime...

Generally, ensure that the submodules are there. You can do that by issuing
following commands:

```bash
git submodule init
git submodule update
```

### Zsh Goodies

`zsh` needs to have zsh installed, obviously. Before `.zshrc` kicks in, symlink
the `.fonts` directory and ensure that the default terminal is the XFCE
terminal. After that, run the following commands:

```bash
ln -s ~/.dotfiles/.fonts ~/.fonts
fc-cache -vf ~/.fonts
mkdir -p ~/.config/fontconfig/conf.d
ln -s ~/.dotfiles/.config/fontconfig/conf.d/10-powerline-symbols.conf \
  ~/.config/fontconfig/conf.d/10-powerline-symbols.conf
mkdir -p ~/.config/xfce4/terminal/
ln -s ~/.dotfiles/.config/xfce4/terminal/terminalrc \
  ~/.config/xfce4/terminal/terminalrc
mkdir -p ~/.local/share/xfce4/terminal
ln -s ~/.dotfiles/.local/share/xfce4/terminal/colorschemes \
  ~/.local/share/xfce4/terminal/colorschemes
ln -s ~/.dotfiles/.zshrc ~/.zshrc
ln -s ~/.dotfiles/.oh-my-zsh ~/.oh-my-zsh
chsh -s /bin/zsh
```

And that should be it, (I think).

## Licenses

Copyright © 2012-2013 Jean Niklas L'orange

Distributed under the MIT License (MIT). You can find a copy in the root of
this directory with the name `LICENSE`.
