@echo off
set path=%~1
set picname=%~n1

set "name=%picname%.eps"

"D:\Program Files (x86)\Graphviz2.38\bin\dot.exe" -Teps "%path%" -l "D:\Program Files (x86)\Graphviz2.38\contrib\sdl.ps" -o "%name%"