<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Model;
use Illuminate\Database\Eloquent\Factories\HasFactory;

class Gift extends Model
{
    use HasFactory;

    public $timestamps = false;

    protected $fillable = [
        'name',
        'valor_previsto',
        'valor_gasto',
        'users_id'
    ];
}
