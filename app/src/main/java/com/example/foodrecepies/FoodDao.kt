package com.example.foodrecepies

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface FoodDao {
//    @Insert
//    suspend fun insertFavDishDetails(favDish: FavDish)
//
//    @Query("SELECT * FROM FAV_DISH_TABLE ORDER BY ID")
//    fun getAllDishesList(): Flow<List<FavDish>>
//
//    @Update
//    suspend fun updateFavDishDetails(favDish: FavDish)
//
//    @Query("SELECT * FROM FAV_DISH_TABLE WHERE favorite_dish = 1")
//    fun getAllFavoriteDishesList(): Flow<List<FavDish>>
//
//    @Delete
//    suspend fun deleteDishDetails(favDish: FavDish)
//
//    @Query("SELECT * FROM FAV_DISH_TABLE WHERE type = :filterType")
//    fun getFilteredDishList(filterType: String): Flow<List<FavDish>>

}