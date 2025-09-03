<?php

class ProgramWindow
{
    public $x;
    public $y;
    public $width;
    public $height;

    function __construct() {
        $this->x = 0;
        $this->y = 0;
        $this->width = 800;
        $this->height = 600;
    }

    function getX() {
        return $this->x;
    }

    function getY() {
        return $this->y;
    }

    function getWidth() {
        return $this->width;
    }

    function getHeight() {
        return $this->height;
    }

    function resize($size) {
        $this->height = $size->getHeight();
        $this->width = $size->getWidth();
    }

    function move($position) {
        $this->x = $position->getX();
        $this->y = $position->getY();
    }
}
