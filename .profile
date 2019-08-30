#umask 022

# if running bash
if [ -n "$BASH_VERSION" ]; then
    # include .bashrc if it exists
    if [ -f "$HOME/.bashrc" ]; then
	. "$HOME/.bashrc"
    fi
fi

# set PATH so it includes user's private bin if it exists
if [ -d "$HOME/bin" ] ; then
    PATH="$HOME/bin:$PATH"
fi

export MAKEFLAGS="-j 8 $MAKEFLAGS"

## Golang
export GOPATH="$HOME/projects/golang"

>>>>>>> parent of 3a0ee65... Force use of go.mod everywhere
