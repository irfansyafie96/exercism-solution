<?php

class Position
{
    public $x;
    public $y;

    function __construct($y, $x) {
        $this->y = $y;
        $this->x = $x;
    }

    function getX() {
        return $this->x;
    }

    function getY() {
        return $this->y;
    }
}
